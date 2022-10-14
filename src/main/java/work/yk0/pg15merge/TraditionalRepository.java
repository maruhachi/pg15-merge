package work.yk0.pg15merge;


import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TraditionalRepository extends JpaRepository<Score, Integer> {

    @Query(value = """
        SELECT * FROM score WHERE id = :id
        """ , nativeQuery = true)
    public Score find(Integer id);

    @Modifying
    @Query(value = """
        INSERT INTO score (id, point) VALUES (:id, :point)
        """ , nativeQuery = true)
    void insert(int id, int point);

    @Modifying
    @Query("""
        UPDATE score SET point = :point WHERE id = :id
""")
    void update(int id, int point);
}
