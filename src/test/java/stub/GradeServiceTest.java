package stub;
import mock.SecurityCenter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    @Mock
    private GradeSystem mockGradeSystem;
    @InjectMocks
    private GradeService gradeService;
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        securityCenter.switchOn();
        gradeService.calculateAverageGrades(90.0,95.0,100.0);


        verify(mockDoorPanel).close();
        //Assertions.assertEquals(90.0, result);
    }
}
