package Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "blogs")
public class Blog {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    public Blog() {}
	    public Blog(String title, String content, String tags) {
	    	super();
			this.title = title;
			this.content = content;
			this.tags = tags;
		}

		private String title;

	    @Column(columnDefinition = "TEXT")
	    private String content;

	    private String tags;

	    @Column(name = "user_id")
	    private int user_id;

	    @Column(name = "created_at")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date createdAt;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

	    public String getTags() {
	        return tags;
	    }

	    public void setTags(String tags) {
	        this.tags = tags;
	    }

	    public int getUser_id() {
	        return user_id;
	    }

	    public void setUser_id(int user_id) {
	        this.user_id = user_id;
	    }

	    public Date getCreatedAt() {
	        return createdAt;
	    }

	    public void setCreatedAt(Date createdAt) {
	        this.createdAt = createdAt;
	    }
}
