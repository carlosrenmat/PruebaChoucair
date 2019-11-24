package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.JobsChoucair;

public class LaRespuestaQ implements Question<Boolean> {
    private String preguntaQ;

    public LaRespuestaQ(String preguntaQ) {
        this.preguntaQ = preguntaQ;
    }

    public static LaRespuestaQ es(String preguntaQ) {
        return new LaRespuestaQ(preguntaQ);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String mensaje = Text.of(JobsChoucair.MESSAGEQ).viewedBy(actor).asString();
        return (preguntaQ.equals(mensaje));
    }
}
