package com.directi.training.ocp.exercise_refactored;

public interface IResource {

    void markSlotFree(int resourceId);
    void markSlotBusy(int resourceId);
    int findFreeSlot();

}
