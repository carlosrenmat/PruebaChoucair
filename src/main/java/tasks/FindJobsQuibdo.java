package tasks;

import model.jobs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import userinterfaces.JobsChoucair;

public class FindJobsQuibdo implements Task{

        private jobs data;

        public FindJobsQuibdo(jobs data) {
            this.data = data;
        }

        public static tasks.FindJobsQuibdo ThePageWith(jobs data) {
            return Tasks.instrumented(tasks.FindJobsQuibdo.class, data);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Scroll.to(JobsChoucair.location), Enter.theValue(data.getLocationQ().trim()).into(JobsChoucair.location),
                    Hit.the(Keys.ENTER).into(JobsChoucair.Boton));
        }
}
