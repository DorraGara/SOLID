package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(IResource resource)
    {
        int resourceId;
        resourceId = resource.findFreeSlot();
        resource.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(IResource resource, int resourceId)
    {
       resource.markSlotFree(resourceId);
    }

}
