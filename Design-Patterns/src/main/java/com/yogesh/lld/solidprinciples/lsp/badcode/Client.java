package com.yogesh.lld.solidprinciples.lsp.badcode;

public class Client {

    public static void main(String[] args) {
        BirdSanctuary sanctuary = new BirdSanctuary();

        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        Ostrich ostrich = new Ostrich();

        System.out.println("----- Feeding individual bird -----");
        sanctuary.feed(sparrow);
        sanctuary.feed(eagle);
        sanctuary.feed(ostrich);

        System.out.println();

        System.out.println("----- Making individual birds fly -----");
        sanctuary.makeItFly(sparrow);
        sanctuary.makeItFly(eagle);
        sanctuary.makeItFly(ostrich);//CRASH-- Unsupported Operation , this where lsp violates, as we can not substitute child object with parent object, child is not following parent contract


    }
}
