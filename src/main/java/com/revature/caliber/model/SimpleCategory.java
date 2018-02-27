package com.revature.caliber.model;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Simple Category.
 */
@Entity
@Table(name = "CALIBER_CATEGORY")
@Cacheable
public class SimpleCategory implements Serializable {
	private static final long serialVersionUID = -9222096298296205812L;

	@Id
	@Column(name = "CATEGORY_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATEGORY_ID_SEQUENCE")
	@SequenceGenerator(name = "CATEGORY_ID_SEQUENCE", sequenceName = "CATEGORY_ID_SEQUENCE", initialValue = 1, allocationSize = 1)
	@JsonProperty(value = "categoryId")
	private Integer categoryId;

	@JsonProperty(value = "skillCategory")
	@Column(name = "SKILL_CATEGORY")
	private String skillCategory;

	@JsonProperty(value = "active")
	@Column(name = "IS_ACTIVE", nullable = false)
	private Boolean active;

	/**
	 * Instantiates a new Category.
	 */
	public SimpleCategory() {
		super();
	}

	/**
	 * Create new category
	 * 
	 * @param skillCategory
	 * @param active
	 */
	public SimpleCategory(String skillCategory, Boolean active) {
		super();
		this.skillCategory = skillCategory;
		this.active = active;
	}

	public SimpleCategory(Category category) {
		super();
		this.categoryId = category.getCategoryId();
		this.skillCategory = category.getSkillCategory();
		this.active = category.isActive();
	}

	/**
	 * Gets category id.
	 *
	 * @return the category id
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * Sets category id.
	 *
	 * @param categoryId
	 *            the category id
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * Gets skill category.
	 *
	 * @return the skill category
	 */
	public String getSkillCategory() {
		return skillCategory;
	}

	/**
	 * Sets skill category.
	 *
	 * @param skillCategory
	 *            the skill category
	 */
	public void setSkillCategory(String skillCategory) {
		this.skillCategory = skillCategory;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + ((skillCategory == null) ? 0 : skillCategory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleCategory other = (SimpleCategory) obj;
		if (active != other.active)
			return false;
		if (skillCategory == null) {
			if (other.skillCategory != null)
				return false;
		} else if (!skillCategory.equals(other.skillCategory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return skillCategory;
	}
}
