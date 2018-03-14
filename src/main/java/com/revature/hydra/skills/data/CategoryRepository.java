package com.revature.hydra.skills.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.SimpleCategory;

@Repository
public interface CategoryRepository extends JpaRepository<SimpleCategory, Integer> {

	List<SimpleCategory> findAllByOrderBySkillCategoryAsc();

	List<SimpleCategory> findByActiveOrderByCategoryIdAsc(boolean active);

	SimpleCategory findOneBySkillCategory(String skillCategory);

}
