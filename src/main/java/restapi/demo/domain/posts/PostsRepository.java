package restapi.demo.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long>  { // class , Pk 타입

    @Query("select p from Posts p order by p.id desc")
    List<Posts> findAllDesc();
}
