package org.wecancodeit.statesdemo;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<Star, Long> {
	Star findOneByAbb(String abb);
}
