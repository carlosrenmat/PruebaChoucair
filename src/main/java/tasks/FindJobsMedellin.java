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

public class FindJobsMedellin implements Task {

    private jobs data;

    public FindJobsMedellin(jobs data) {
        this.data = data;
    }

    public static FindJobsMedellin ThePageWith(jobs data) {
        return Tasks.instrumented(FindJobsMedellin.class, data);
    }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Scroll.to(JobsChoucair.location), Enter.theValue(data.getLocation().trim()).into(JobsChoucair.location),
                    Hit.the(Keys.ENTER).into(JobsChoucair.Boton));
        }
    }

