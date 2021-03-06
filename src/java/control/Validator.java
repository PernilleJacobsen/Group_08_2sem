/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Jeanette
 */
public class Validator
{

    private String patternLetters = "[a-zA-Z]*";
    private String patternNumbers = "[0-9]*";

    public String validator(
            int project_budget,
            int partnerID,
            String startDate,
            String endDate,
            String activityDescription,
            String targetAudience,
            String objectiveResult,
            String firstname,
            String lastname,
            String phone
    ) throws InvalidDataException
    {
        try
        {
            System.err.println("fejl");
            if ((project_budget + "").matches(patternLetters))
            {
                throw new InvalidDataException("Budget cannot contain letters");
            }
            if ((partnerID + "").matches(patternLetters))
            {
                throw new InvalidDataException("PartnerID cannot contain letters");
            }
            if (patternLetters.matches(partnerID + ""))
            {
                throw new InvalidDataException("PartnerID cannot contain letters");
            }
            if (project_budget == 0)
            {
                throw new InvalidDataException("Budget cannot be empty");
            }
            if (partnerID == 0)
            {
                throw new InvalidDataException("PartnerID cannot be empty");
            }
            if (activityDescription.equals(""))
            {
                throw new InvalidDataException("Activity Description cannot be empty");
            }

            if (startDate.matches(patternLetters))
            {
                throw new InvalidDataException("The date needs to be write in the format: yyyy-mm-dd");
            }

            if (endDate.matches(patternLetters))
            {
                throw new InvalidDataException("The date needs to be write in the format: yyyy-mm-dd");
            }

            if (targetAudience.matches(patternNumbers))
            {
                throw new InvalidDataException("Target audience cannot contain numbers");
            }

            if (targetAudience.equals(""))
            {
                throw new InvalidDataException("Target audience cannot be empty");
            }

            if (objectiveResult.equals(""))
            {
                throw new InvalidDataException("Objective and result cannot be empty");
            }
            return "";

        } catch (InvalidDataException ide)
        {
            throw ide;
        } catch (Exception e)
        {
            e.printStackTrace(System.err);
            throw new InvalidDataException("Unknown error " + e);
        }

    }
}
