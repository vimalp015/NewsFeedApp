// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.au.vimalprakash.thenewsfeedapp.di.modules;

import com.au.vimalprakash.thenewsfeedapp.NewsFeedApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class SupportModules_ProvidesApplicationFactory
    implements Factory<NewsFeedApplication> {
  private final SupportModules module;

  public SupportModules_ProvidesApplicationFactory(SupportModules module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public NewsFeedApplication get() {
    return Preconditions.checkNotNull(
        module.providesApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<NewsFeedApplication> create(SupportModules module) {
    return new SupportModules_ProvidesApplicationFactory(module);
  }

  /** Proxies {@link SupportModules#providesApplication()}. */
  public static NewsFeedApplication proxyProvidesApplication(SupportModules instance) {
    return instance.providesApplication();
  }
}
