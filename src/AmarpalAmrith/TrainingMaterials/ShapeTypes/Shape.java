package AmarpalAmrith.TrainingMaterials.ShapeTypes;

public interface Shape {

    String getColour();

    default String getType(){
        return getClass().getSimpleName();
    }

    default String prettyPrint() {
        return toString();
    }

}
