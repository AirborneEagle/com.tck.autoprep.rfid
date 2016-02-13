/**
 * 
 */
package autoprep.db;

import javax.persistence.Column;
import javax.persistence.Entity;

import autoprep.api.BaseRecord;

/**
 * @author tyler
 *
 */
@Entity
public class TKC_UnitName extends BaseRecord
{
    @Column(unique = true)
    private String name;
}
