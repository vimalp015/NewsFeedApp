// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.au.vimalprakash.thenewsfeedapp.di.components;

import com.au.vimalprakash.thenewsfeedapp.di.modules.ActivityModules;
import com.au.vimalprakash.thenewsfeedapp.di.modules.ActivityModules_GetMainActivityPresenterFactory;
import com.au.vimalprakash.thenewsfeedapp.di.modules.ActivityModules_GetNewsFeedPresenterFactory;
import com.au.vimalprakash.thenewsfeedapp.modules.mainactivity.MainAcivityContract;
import com.au.vimalprakash.thenewsfeedapp.modules.mainactivity.MainActivity;
import com.au.vimalprakash.thenewsfeedapp.modules.mainactivity.MainActivity_MembersInjector;
import com.au.vimalprakash.thenewsfeedapp.modules.newsfeed.NewsFeedContract;
import com.au.vimalprakash.thenewsfeedapp.modules.newsfeed.NewsFeedFragment;
import com.au.vimalprakash.thenewsfeedapp.modules.newsfeed.NewsFeedFragment_MembersInjector;
import com.au.vimalprakash.thenewsfeedapp.networking.NewsFeedApi;
import com.au.vimalprakash.thenewsfeedapp.utils.SchedulersProvider;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerActivityComponents implements ActivityComponents {
  private Provider<SchedulersProvider> getSchedulersProvider;

  private Provider<MainAcivityContract.Presenter> getMainActivityPresenterProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private Provider<NewsFeedApi> getNewsFeedApiProvider;

  private Provider<NewsFeedContract.Presenter> getNewsFeedPresenterProvider;

  private MembersInjector<NewsFeedFragment> newsFeedFragmentMembersInjector;

  private DaggerActivityComponents(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getSchedulersProvider =
        new com_au_vimalprakash_thenewsfeedapp_di_components_SupportComponents_getSchedulersProvider(
            builder.supportComponents);

    this.getMainActivityPresenterProvider =
        DoubleCheck.provider(
            ActivityModules_GetMainActivityPresenterFactory.create(
                builder.activityModules, getSchedulersProvider));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(getMainActivityPresenterProvider);

    this.getNewsFeedApiProvider =
        new com_au_vimalprakash_thenewsfeedapp_di_components_SupportComponents_getNewsFeedApi(
            builder.supportComponents);

    this.getNewsFeedPresenterProvider =
        DoubleCheck.provider(
            ActivityModules_GetNewsFeedPresenterFactory.create(
                builder.activityModules, getNewsFeedApiProvider, getSchedulersProvider));

    this.newsFeedFragmentMembersInjector =
        NewsFeedFragment_MembersInjector.create(getNewsFeedPresenterProvider);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(NewsFeedFragment fragment) {
    newsFeedFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private ActivityModules activityModules;

    private SupportComponents supportComponents;

    private Builder() {}

    public ActivityComponents build() {
      if (activityModules == null) {
        this.activityModules = new ActivityModules();
      }
      if (supportComponents == null) {
        throw new IllegalStateException(
            SupportComponents.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponents(this);
    }

    public Builder activityModules(ActivityModules activityModules) {
      this.activityModules = Preconditions.checkNotNull(activityModules);
      return this;
    }

    public Builder supportComponents(SupportComponents supportComponents) {
      this.supportComponents = Preconditions.checkNotNull(supportComponents);
      return this;
    }
  }

  private static
  class com_au_vimalprakash_thenewsfeedapp_di_components_SupportComponents_getSchedulersProvider
      implements Provider<SchedulersProvider> {
    private final SupportComponents supportComponents;

    com_au_vimalprakash_thenewsfeedapp_di_components_SupportComponents_getSchedulersProvider(
        SupportComponents supportComponents) {
      this.supportComponents = supportComponents;
    }

    @Override
    public SchedulersProvider get() {
      return Preconditions.checkNotNull(
          supportComponents.getSchedulersProvider(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static
  class com_au_vimalprakash_thenewsfeedapp_di_components_SupportComponents_getNewsFeedApi
      implements Provider<NewsFeedApi> {
    private final SupportComponents supportComponents;

    com_au_vimalprakash_thenewsfeedapp_di_components_SupportComponents_getNewsFeedApi(
        SupportComponents supportComponents) {
      this.supportComponents = supportComponents;
    }

    @Override
    public NewsFeedApi get() {
      return Preconditions.checkNotNull(
          supportComponents.getNewsFeedApi(),
          "Cannot return null from a non-@Nullable component method");
    }
  }
}
