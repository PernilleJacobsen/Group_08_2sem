<%-- 
    Document   : ChangeProject
    Created on : 17-04-2015, 11:50:24
    Author     : martamiszczyk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>View and Change Project ${project.getProjectID()}</h1>

        <form name="Change project" action="UpdateChangeProjectServlet" method="POST">
            <hr> 
            <br>
            <div> Project id:<input type="text" name="projectID" value='${project.getProjectID()}' size="20" readonly="readonly" />
                <br>
                <br>
                Status:&nbsp <input type="text" name="" value='${project.getStatus()}'  size="20" readonly="readonly"/>
            &nbsp To change status use the dropdown: &nbsp <select name="status">
                <option value="Project proposal">Project proposal</option>
                <option value="Submit">Submittet</option>
                <option value="Execution">Execution</option>
                <option value="Request POE">Request POE</option>
                <option value="Approval">Approval</option>
                <option value="Claim sent">Claim sent</option>
            </select>
            <br>
            <br>
            Start date: 
            <input type="text" name="startDate" value='${project.getStartDate()}' size="20" />&nbsp &nbsp &nbsp
            End date: 
            <input type="text" name="endDate" value='${project.getEndDate()}' size="20" />
            <p1>Quarter:</p1>
            <input type="text" name="quarter" value='${project.getQuarter()}' size="20" />&nbsp &nbsp &nbsp
            <br>
            <br>
            <p1>Budget: 
                <input type="text" name="budget" value='${project.getProjectBudget()}' size="20" />&nbsp &nbsp &nbsp
                Cost: 
                <input type="text" name="cost" value='${project.getCost()}' size="20" />&nbsp &nbsp &nbsp
                Currency: 
                <input type="text" name="currency" value='${project.getCurrency()}' size="20" readonly="readonly" />
                <br>
                <br>
            Activity description:
            <br>
            <textarea name="activityDescription" rows="10" cols="40"  > ${project.getActivityDescription()}</textarea>
            <br>
            <br>
            <p3>Comments: 
                <br>
                <textarea name="comments" rows="10" cols="40" >${project.getComments()}</textarea> </p3>
            <br>
            <br>
            Target audience: 
            <input type="text" name="targetAudience" value='${project.getTargetAudience()}' size="20" />
            <br>
            <br>
            Objective & result: 
            <br>
            <textarea name="objectiveResult" rows="10" cols="40">${project.getObjectiveResult()}</textarea>
            <br>
            <br>
            Required POE:
            <input type="text" name="requiredPOE" value="Nothing here yet" size="20" disabled="disabled" />
            <br>
            <br>
            Employee ID:
            <input type="text" name="employeeID" value='${project.getEmployeeID()}' />
            <br>
            <br>
            Partner ID:
            <input type="text" name="partnerID" value="1" size="20" readonly="readonly" />
            <br>
            <br>
            <input type="submit" value="UpdateChangeProjectServlet" name="UpdateChangeProjectServlet" style="width: 10em;  height:5em;" />
        </form>
    </body>
</html>
