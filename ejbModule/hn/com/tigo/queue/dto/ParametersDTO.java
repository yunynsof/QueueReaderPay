package hn.com.tigo.queue.dto;

import java.util.Date;


/**
 * ParametersDTO.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 08-25-2022 09:18:18 PM 2022
 */
public class ParametersDTO extends DTO {


	/** The id application. */
	private long idApplication;

	/** The name. */
	private String name;

	/** The value. */
	private String value;

	/** The description. */
	private String description;

	/** The created date. */
	private Date createdDate;

	/**
	 * Instantiates a new parameters DTO.
	 */
	public ParametersDTO() {
	}

	
	/**
	 * Gets the id application.
	 *
	 * @return the id application
	 */
	public final long getIdApplication() {
		return idApplication;
	}


	/**
	 * Sets the id application.
	 *
	 * @param idApplication the new id application
	 */
	public final void setIdApplication(long idApplication) {
		this.idApplication = idApplication;
	}

	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public final void setName(String name) {
		this.name = name;
	}

	
	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public final String getValue() {
		return value;
	}

	
	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public final void setValue(String value) {
		this.value = value;
	}

	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}

	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public final void setDescription(String description) {
		this.description = description;
	}


	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public final Date getCreatedDate() {
		return createdDate;
	}

	
	/**
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public final void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
