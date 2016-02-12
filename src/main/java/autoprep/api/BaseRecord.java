package autoprep.api;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseRecord 
{
    
    @Id
    private String id = UUID.randomUUID().toString();

    private String parentId;
    
    private String parentClass;
    
    
    /**
     * @return the parentId
     */
    public String getParentId()
    {
        return this.parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(String parentId)
    {
        this.parentId = parentId;
    }

    /**
     * @return the parentClass
     */
    public String getParentClass()
    {
        return this.parentClass;
    }

    /**
     * @param parentClass the parentClass to set
     */
    public void setParentClass(String parentClass)
    {
        this.parentClass = parentClass;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

}
