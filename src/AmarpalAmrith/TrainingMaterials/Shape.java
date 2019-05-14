package AmarpalAmrith.TrainingMaterials;

public interface Shape {

    default String getType(){
        return getClass().getSimpleName();
    }

    default String prettyPrint() {
        return toString();
    }
}
