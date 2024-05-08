package data.exceptions;

import data.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import time.DateUtils;
import time.WeekView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static data.exceptions.TaskManagerException.checkIfDateHasTasks;
import static data.exceptions.TaskManagerException.checkIfDateInCurrentMonth;
import static data.exceptions.TaskManagerException.checkIfDateInCurrentWeek;
import static data.exceptions.TaskManagerException.checkIfDateInFormat;
import static data.exceptions.TaskManagerException.checkIfDateTimeInFormat;
import static data.exceptions.TaskManagerException.checkIfTimeInFormat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TaskManagerExceptionTest {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate today = LocalDate.now();
    LocalDate startOfWeek = DateUtils.getStartOfWeek(today);
    WeekView weekView = new WeekView(startOfWeek, DATE_TIME_FORMATTER);

    @Test
    public void checkIfDateInCurrentMonth_pastDateGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfDateInCurrentMonth(LocalDate.parse("1111-11-11")),
                "TaskManagerException was expected");

        Assertions.assertEquals("The date must be within the current month. " + "Please try again.",
                thrown.getMessage());
    }

    @Test
    public void checkIfDateInCurrentMonth_futureDateGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
            checkIfDateInCurrentMonth(LocalDate.parse("2222-11-11")),
                "TaskManagerException was expected");

        Assertions.assertEquals("The date must be within the current month. " + "Please try again.",
                thrown.getMessage());
    }

    @Test
    public void checkIfDateInCurrentWeek_pastDateGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
            checkIfDateInCurrentWeek(LocalDate.parse("1111-11-11"), weekView),
                "TaskManagerException was expected");

        Assertions.assertEquals("The date must be within the current week. Please try again.",
                thrown.getMessage());
    }

    @Test
    public void checkIfDateInCurrentWeek_futureDateGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfDateInCurrentWeek(LocalDate.parse("2222-11-11"), weekView),
                "TaskManagerException was expected");

        Assertions.assertEquals("The date must be within the current week. Please try again.",
                thrown.getMessage());
    }

    @Test
    public void checkIfDateHasTasks_noTasksOnDate_exceptionThrown () {
        List<Task> dayWithNoTasks = new ArrayList<>();
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfDateHasTasks(dayWithNoTasks));

        Assertions.assertEquals("There are no tasks on this date. Please try again.", thrown.getMessage());
    }

    @Test
    public void checkIfDateTimeInFormat_validDateTimeGiven_noExceptionThrown () {
        assertDoesNotThrow(() -> checkIfDateTimeInFormat("15/04/2024 1600"));
    }

    @Test
    public void checkIfDateTimeInFormat_invalidDateTimeDelimitersGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfDateTimeInFormat("15-04-2024 1600"));
        Assertions.assertEquals("Invalid start date and time format. " +
                "Please use the format dd/MM/yyyy HHmm", thrown.getMessage());
    }

    @Test
    public void checkIfDateTimeInFormat_invalidDateGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfDateTimeInFormat("15042024 1600"));
        Assertions.assertEquals("Invalid start date and time format. " +
                "Please use the format dd/MM/yyyy HHmm", thrown.getMessage());
    }

    @Test
    public void checkIfDateTimeInFormat_invalidTimeGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfDateTimeInFormat("15/04/2024 16:00"));
        Assertions.assertEquals("Invalid start date and time format. " +
                "Please use the format dd/MM/yyyy HHmm", thrown.getMessage());
    }

    @Test
    public void checkIfDateTimeInFormat_dateTimeNotSeparatedWithWhiteSpace_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfDateTimeInFormat("15/04/2024-16:00"));
        Assertions.assertEquals("Invalid start date and time format. " +
                "Please use the format dd/MM/yyyy HHmm", thrown.getMessage());
    }

    @Test
    public void checkIfDateInFormat_validDateGiven_noExceptionThrown () {
        assertDoesNotThrow(() -> checkIfDateInFormat("15/04/2024"));
    }

    @Test
    public void checkIfDateInFormat_invalidDateGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfDateInFormat("152/04/2024"));
        Assertions.assertEquals("Invalid start date format. " +
                "Please use the format dd/MM/yyyy", thrown.getMessage());
    }

    @Test
    public void checkIfDateInFormat_invalidDateDelimitersGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfDateInFormat("15-04-2024"));
        Assertions.assertEquals("Invalid start date format. " +
                "Please use the format dd/MM/yyyy", thrown.getMessage());
    }

    @Test
    public void checkIfTimeInFormat_validTimeGiven_noExceptionThrown () {
        assertDoesNotThrow(() -> checkIfTimeInFormat("1600"));
    }

    @Test
    public void checkIfDateInFormat_invalidTimeGiven_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfTimeInFormat("15024"));
        Assertions.assertEquals("Invalid time format." +
                " Please use the format HHmm", thrown.getMessage());
    }

    @Test
    public void checkIfTimeInFormat_dateGivenInstead_exceptionThrown () {
        TaskManagerException thrown = Assertions.assertThrows(TaskManagerException.class, () ->
                checkIfTimeInFormat("15-04-2024"));
        Assertions.assertEquals("Invalid time format." +
                " Please use the format HHmm", thrown.getMessage());
    }
}
