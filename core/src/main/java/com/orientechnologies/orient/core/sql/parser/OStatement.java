/* Generated By:JJTree: Do not edit this line. OStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.command.OCommandRequest;
import com.orientechnologies.orient.core.db.ODatabaseDocumentInternal;
import com.orientechnologies.orient.core.db.ODatabaseRecordThreadLocal;
import com.orientechnologies.orient.core.sql.OCommandExecutorSQLAbstract;
import com.orientechnologies.orient.core.sql.OCommandSQLParsingException;

import java.util.Map;

public class OStatement extends SimpleNode {

  public static final String CUSTOM_STRICT_SQL = "strictSql";

  public OStatement(int id) {
    super(id);
  }

  public OStatement(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public OCommandExecutorSQLAbstract buildExecutor(final OCommandRequest iRequest) {
    return null; // TODO make it abstract
  }

  public static ODatabaseDocumentInternal getDatabase() {
    return ODatabaseRecordThreadLocal.INSTANCE.get();
  }

  public void replaceParameters(Map<Object, Object> params) {

  }

  public void validate(OrientSql.ValidationStats stats) throws OCommandSQLParsingException {

  }
}
/* JavaCC - OriginalChecksum=589c4dcc8287f430e46d8eb12b0412c5 (do not edit this line) */