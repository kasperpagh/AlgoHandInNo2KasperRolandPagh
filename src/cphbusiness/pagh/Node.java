package cphbusiness.pagh;

public class Node
{
    Questions question;
    Node yesNode; //YES
    Node noNode; //NO
    int id;

    String decision;


    public Node(Questions question)
    {
        this.question = question;
    }

    public Node()
    {

    }

    public Node getYesNode()
    {
        return yesNode;
    }

    public void setYesNode(Node yesNode)
    {
        this.yesNode = yesNode;
    }

    public Node getNoNode()
    {
        return noNode;
    }

    public void setNoNode(Node noNode)
    {
        this.noNode = noNode;
    }

    public Questions getQuestion()
    {
        return question;
    }

    public void setQuestion(Questions question)
    {
        this.question = question;
    }

    public String getDecision()
    {
        return decision;
    }

    public void setDecision(String decision)
    {
        this.decision = decision;
    }

    public boolean isTerminalNode()
    {
        if (yesNode == null && noNode == null)
        {
            return true;
        }
        return false;
    }
}
