

import oracle.apps.fnd.common.Context;

import oracle.apps.fnd.common.VersionInfo;

import oracle.apps.fnd.cp.request.CpContext;

import oracle.apps.fnd.cp.request.*;

import oracle.apps.fnd.util.*;

import java.sql.*;

   public class TestJCP implements JavaConcurrentProgram {

      OutFile out;

      LogFile log;

      public void runProgram(CpContext ctx) {

         Connection conn = null;
         
         out = ctx.getOutFile();

         log = ctx.getLogFile();

         try {

           

           // ParameterList parms = ctx.getParameterList();

            conn = ctx.getJDBCConnection();

            int userId = ctx.getReqDetails().getUserInfo().getUserId();

         // insert your code here

            log.write("Hello World", 0);

            out.write("Hello World");

            ctx.getReqCompletion().setCompletion(ReqCompletion.NORMAL, "Completed.");

         } catch (Exception e) {

            out.writeln("Exception during PPS Reconciliation...n" + e.getMessage());

            ctx.getReqCompletion().setCompletion(ReqCompletion.ERROR, "Completed.");

         } finally {

            try { conn.rollback(); } catch (SQLException e) {}

         }

      }

   }