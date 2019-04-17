/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList; 

public class Club
{
    private String clubName;
    private ArrayList<Membership> listMembers;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        clubName = "Paradise City";
        listMembers = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        listMembers.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {   
        int totalOfMembers;
        
        totalOfMembers = listMembers.size();

        return totalOfMembers;
    }
}
