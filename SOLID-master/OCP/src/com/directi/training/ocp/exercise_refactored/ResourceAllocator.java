package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(IResourceManager resource)
    {
        int resourceId;
        resourceId = resource.findFreeSlot();
        resource.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(IResourceManager resource, int resourceId)
    {
       resource.markSlotFree(resourceId);
    }

}
