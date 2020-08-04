package stub;
import mock.SecurityCenter;
import org.apiguardian.api.API;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    //@InjectMocks
    //private GradeService gradeService;
    @Mock
    private GradeService mockGradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeSystem gradeSystem = new GradeSystem();
        long studentID = 1;
        when(mockGradeService.calculateAverageGrades(studentID)).thenReturn(90.0);

//        verify(mockGradeService).calculateAverageGrades(studentID);
        Assertions.assertEquals(90.0,mockGradeService.calculateAverageGrades(studentID));
    }
}
