package autoprep.db;


import java.util.List;

import javax.persistence.Entity;

import autoprep.api.BaseRecord;

@Entity
public class TKC_Household extends BaseRecord
{
    
	private String name;
	
	private List<TKC_Person> persons;
	
	private List<TKC_Goal> goals;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    /**
     * @return the persons
     */
    public List<TKC_Person> getPersons()
    {
        return persons;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(List<TKC_Person> persons)
    {
        this.persons = persons;
    }

    /**
     * @return the goals
     */
    public List<TKC_Goal> getGoals()
    {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(List<TKC_Goal> goals)
    {
        this.goals = goals;
    }
	
}
