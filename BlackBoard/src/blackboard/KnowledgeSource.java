/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackboard;

/**
 *
 * @author edemb
 */
public abstract class KnowledgeSource {

    protected String name;
    protected BlackBoard blackboard;

    public KnowledgeSource(String name, BlackBoard blackboard) {
        this.name = name;
        this.blackboard = blackboard;
    }

    public abstract void solveProblem();

    public String getName() {
        return name;
    }

    
}
