import com.baizhi.dao.DeptDao;
import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class Test1 {

    @Autowired
    private DeptService deptService;

    /*@Test
    public void test01(){
        deptDao.save(new Dept("111","10011","asd","1998/12/12","32","asd"));
    }*/
    @Test
    public void test02(){
        List<Dept> dept = deptService.findByPage(0, 3);
        for (Dept dept1 : dept) {
            System.out.println(dept1);
        }
    }
}
