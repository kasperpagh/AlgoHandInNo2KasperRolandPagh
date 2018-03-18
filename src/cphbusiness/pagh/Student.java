package cphbusiness.pagh;

public class Student
{
    private Questions[] questions;
    private Node currentNode;


    public Student(Questions[] questions, Node currentNode)
    {
        this.questions = questions;
        this.currentNode = currentNode;
    }

    public Questions[] getQuestions()
    {
        return questions;
    }

    public void setQuestions(Questions[] questions)
    {
        this.questions = questions;
    }

    public Node getCurrentNode()
    {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode)
    {
        this.currentNode = currentNode;
    }
}
