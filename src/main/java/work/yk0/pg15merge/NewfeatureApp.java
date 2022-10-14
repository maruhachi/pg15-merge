package work.yk0.pg15merge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface NewfeatureApp extends JpaRepository<Score, Integer> {

    @Modifying
    @Query(value="""
        MERGE INTO Score as s
        USING( VALUES(:id, :point)) as v(id, point)
        ON s.id = v.id
        WHEN MATCHED THEN
            UPDATE  SET point = v.point
        WHEN NOT MATCHED THEN
            INSERT (id, point) VALUES (v.id, v.point)
    """, nativeQuery = true)
    public void exec(Integer id, Integer point);
}
