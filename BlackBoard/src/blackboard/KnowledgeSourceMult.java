/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackboard;

/**
 *
 * @author edemb
 */
public class KnowledgeSourceMult extends KnowledgeSource {

    public KnowledgeSourceMult(String name, BlackBoard blackboard) {
        super(name, blackboard);
    }

    @Override
    public void solveProblem() {
        int result = (int) blackboard.getData("a") * (int) blackboard.getData("b");
        blackboard.updateData("x", result);
        this.blackboard.changeProblem();

    }

}
