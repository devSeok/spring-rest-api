package restapi.demo.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass  // 상속할경우 필드도 칼럼으로 인식하도록 하는 어노테이션
@EntityListeners(AuditingEntityListener.class)  // 서비스
public abstract class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime createdDate;

    @CreatedDate
    private LocalDateTime modifiedDate;
}
