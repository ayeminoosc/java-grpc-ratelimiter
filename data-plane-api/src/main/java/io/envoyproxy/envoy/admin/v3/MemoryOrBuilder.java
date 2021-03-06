// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/memory.proto

package io.envoyproxy.envoy.admin.v3;

public interface MemoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.admin.v3.Memory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of bytes allocated by the heap for Envoy. This is an alias for
   * `generic.current_allocated_bytes`.
   * </pre>
   *
   * <code>uint64 allocated = 1;</code>
   * @return The allocated.
   */
  long getAllocated();

  /**
   * <pre>
   * The number of bytes reserved by the heap but not necessarily allocated. This is an alias for
   * `generic.heap_size`.
   * </pre>
   *
   * <code>uint64 heap_size = 2;</code>
   * @return The heapSize.
   */
  long getHeapSize();

  /**
   * <pre>
   * The number of bytes in free, unmapped pages in the page heap. These bytes always count towards
   * virtual memory usage, and depending on the OS, typically do not count towards physical memory
   * usage. This is an alias for `tcmalloc.pageheap_unmapped_bytes`.
   * </pre>
   *
   * <code>uint64 pageheap_unmapped = 3;</code>
   * @return The pageheapUnmapped.
   */
  long getPageheapUnmapped();

  /**
   * <pre>
   * The number of bytes in free, mapped pages in the page heap. These bytes always count towards
   * virtual memory usage, and unless the underlying memory is swapped out by the OS, they also
   * count towards physical memory usage. This is an alias for `tcmalloc.pageheap_free_bytes`.
   * </pre>
   *
   * <code>uint64 pageheap_free = 4;</code>
   * @return The pageheapFree.
   */
  long getPageheapFree();

  /**
   * <pre>
   * The amount of memory used by the TCMalloc thread caches (for small objects). This is an alias
   * for `tcmalloc.current_total_thread_cache_bytes`.
   * </pre>
   *
   * <code>uint64 total_thread_cache = 5;</code>
   * @return The totalThreadCache.
   */
  long getTotalThreadCache();

  /**
   * <pre>
   * The number of bytes of the physical memory usage by the allocator. This is an alias for
   * `generic.total_physical_bytes`.
   * </pre>
   *
   * <code>uint64 total_physical_bytes = 6;</code>
   * @return The totalPhysicalBytes.
   */
  long getTotalPhysicalBytes();
}
