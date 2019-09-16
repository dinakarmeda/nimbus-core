/**
 *  Copyright 2016-2019 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.antheminc.oss.nimbus.domain.model.state.repo.db.rdbms;

/**
 * @author Soham Chakravarti
 *
 */
public class JPAConstants {

	public static final String SEQ_GEN_NAME = "seq.gen";
	public static final String SEQ_GEN_STRATEGY = "com.antheminc.oss.nimbus.domain.model.state.repo.db.rdbms.ConditionalHibernateSequenceIdGenerator";
	
	public static final String SEQ_GEN_PARAM_K_NM = "sequence_name";
}
