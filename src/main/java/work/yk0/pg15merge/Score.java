package work.yk0.pg15merge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "score")
public class Score {

    @Id
    @Column(name="id")
    private int id;

    private int point;

    // 以下、おまじない的文書 ============

    public Score() {
    }
    public Score(int id, int point) {
        this.id = id;
        this.point = point;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
