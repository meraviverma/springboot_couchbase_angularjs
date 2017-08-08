package com.db.springbootcouchbase.repository;

/**
 * Created by RV00451128 on 8/2/2017.
 */

import com.db.springbootcouchbase.domain.Topic;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by RV00451128 on 7/19/2017.
 */
@ViewIndexed(designDoc = "topic", viewName = "all")
public interface TopicRepo extends CouchbaseRepository<Topic,String> {
}
