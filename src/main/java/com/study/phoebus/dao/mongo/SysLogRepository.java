package com.study.phoebus.dao.mongo;import com.study.phoebus.entity.SysLog;import org.springframework.data.mongodb.repository.MongoRepository;import org.springframework.stereotype.Repository;@Repositorypublic interface SysLogRepository extends MongoRepository<SysLog,Long> {}