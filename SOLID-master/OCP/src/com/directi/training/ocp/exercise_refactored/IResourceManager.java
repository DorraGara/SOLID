package com.directi.training.ocp.exercise_refactored;

public interface IResourceManager {

    void markSlotFree(int resourceId);
    void markSlotBusy(int resourceId);
    int findFreeSlot();

}
