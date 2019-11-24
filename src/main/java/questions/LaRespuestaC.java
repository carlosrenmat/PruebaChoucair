package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.JobsChoucair;

public class LaRespuestaC implements Question<Boolean> {
    private String preguntaC;

    public LaRespuestaC(String preguntaC) {
        this.preguntaC = preguntaC;
    }

    public static LaRespuestaC es(String preguntaC) {
        return new LaRespuestaC(preguntaC);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String mensaje = Text.of(JobsChoucair.MESSAGEQ).viewedBy(actor).asString();
        return (preguntaC.equals(mensaje));
    }
}
