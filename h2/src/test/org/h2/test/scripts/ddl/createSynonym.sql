-- Copyright 2004-2019 H2 Group. Multiple-Licensed under the MPL 2.0,
-- and the EPL 1.0 (http://h2database.com/html/license.html).
-- Initial Developer: H2 Group
--

CREATE SCHEMA SCHEMA1;
> ok

CREATE SCHEMA SCHEMA2;
> ok

CREATE TABLE SCHEMA1.T1(K BIGINT PRIMARY KEY, V VARCHAR);
> ok

CREATE SYNONYM SCHEMA1.T1 FOR SCHEMA1.T1;
> exception TABLE_OR_VIEW_ALREADY_EXISTS_1

CREATE SYNONYM SCHEMA2.T1 FOR SCHEMA1.T1;
> ok

DROP SYNONYM SCHEMA2.T1;
> ok

SET SCHEMA SCHEMA2;
> ok

CREATE SYNONYM T1 FOR SCHEMA1.T1;
> ok

DROP SYNONYM T1;
> ok

SET SCHEMA SCHEMA1;
> ok

CREATE SYNONYM T1 FOR T1;
> exception TABLE_OR_VIEW_ALREADY_EXISTS_1

CREATE SYNONYM SCHEMA2.T1 FOR T1;
> ok

DROP SYNONYM SCHEMA2.T1;
> ok

SET SCHEMA PUBLIC;
> ok

DROP SCHEMA SCHEMA2 CASCADE;
> ok

DROP SCHEMA SCHEMA1 CASCADE;
> ok
