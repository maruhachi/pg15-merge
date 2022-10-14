package work.yk0.pg15merge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class AppService {

    @Autowired
    TraditionalRepository traditionalApp;

    @Autowired
    NewfeatureApp newfeatureApp;

    private final int paramId = 4;

    private final int paramScore = 111;

    @Transactional
    public void execTraditional() {
        Score score = traditionalApp.find(paramId);

        if (score == null) {
            traditionalApp.insert(paramId, paramScore);
        } else {
            traditionalApp.update(paramId, paramScore);
        }
    }

    @Transactional
    public void execNewfeature() {
        newfeatureApp.exec(paramId, paramScore);
    }

}
