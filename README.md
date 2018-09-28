# RecyclerViewSnapping [![Build Status](https://travis-ci.org/x1210x/RecyclerViewSnapping.svg?branch=master)](https://travis-ci.org/x1210x/RecyclerViewSnapping)
RecyclerView 스냅핑 예제
* 스냅핑 관련
  * [PagerSnapHelper](https://developer.android.com/reference/android/support/v7/widget/PagerSnapHelper) : ViewPager와 유사한 동작
  * [LinearSnapHelper](https://developer.android.com/reference/android/support/v7/widget/LinearSnapHelper) : RecyclerView 센터로 스냅 
  * [RecyclerViewSnap](https://github.com/rubensousa/RecyclerViewSnap) : start, end, top, bottom 스냅핑
* 그밖에 사용한 라이브러리들
  * [Coroutines](https://kotlinlang.org/docs/reference/coroutines.html)
  * [Dagger 2](https://github.com/google/dagger)
  * [ScrollingPagerIndicator](https://github.com/TinkoffCreditSystems/ScrollingPagerIndicator)
  * [Timber](https://github.com/JakeWharton/timber)
* 특이사항
  * [AndroidX](https://developer.android.com/topic/libraries/support-library/androidx-overview)를 적용하면서 3rd party 라이브러리들([RecyclerViewSnap](https://github.com/rubensousa/RecyclerViewSnap), [ScrollingPagerIndicator](https://github.com/TinkoffCreditSystems/ScrollingPagerIndicator))과 충돌 발생. 빌드+동작은 가능하나 Android Studio에서 빨간줄 그어짐.
