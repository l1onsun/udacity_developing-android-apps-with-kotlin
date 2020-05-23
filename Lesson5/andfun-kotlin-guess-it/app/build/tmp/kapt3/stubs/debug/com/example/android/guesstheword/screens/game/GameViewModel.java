package com.example.android.guesstheword.screens.game;

import java.lang.System;

/**
 * * ViewModel containing all the logic needed to run the game
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0002)*B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u00020\"H\u0014J\u0006\u0010%\u001a\u00020\"J\u0006\u0010&\u001a\u00020\"J\u0006\u0010\'\u001a\u00020\"J\b\u0010(\u001a\u00020\"H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R5\u0010\u0012\u001a&\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\r0\r \u0013*\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0 X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/example/android/guesstheword/screens/game/GameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentTime", "Landroidx/lifecycle/MutableLiveData;", "", "_eventBuzz", "Lcom/example/android/guesstheword/screens/game/GameViewModel$BuzzType;", "_eventGameFinish", "", "_score", "", "_word", "", "currentTime", "Landroidx/lifecycle/LiveData;", "getCurrentTime", "()Landroidx/lifecycle/LiveData;", "currentTimeString", "kotlin.jvm.PlatformType", "getCurrentTimeString", "eventBuzz", "getEventBuzz", "eventGameFinish", "getEventGameFinish", "score", "getScore", "timer", "Landroid/os/CountDownTimer;", "word", "getWord", "wordList", "", "nextWord", "", "onBuzzComplete", "onCleared", "onCorrect", "onGameFinishComplete", "onSkip", "resetList", "BuzzType", "Companion", "app_debug"})
public final class GameViewModel extends androidx.lifecycle.ViewModel {
    private final android.os.CountDownTimer timer = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _currentTime = null;
    private final androidx.lifecycle.LiveData<java.lang.String> currentTimeString = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _word = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _score = null;
    private java.util.List<java.lang.String> wordList;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventGameFinish = null;
    private final androidx.lifecycle.MutableLiveData<com.example.android.guesstheword.screens.game.GameViewModel.BuzzType> _eventBuzz = null;
    private static final long DONE = 0L;
    private static final long COUNTDOWN_PANIC_SECONDS = 10L;
    private static final long ONE_SECOND = 1000L;
    private static final long COUNTDOWN_TIME = 60000L;
    public static final com.example.android.guesstheword.screens.game.GameViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getCurrentTime() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<java.lang.String> getCurrentTimeString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventGameFinish() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.guesstheword.screens.game.GameViewModel.BuzzType> getEventBuzz() {
        return null;
    }
    
    /**
     * * Resets the list of words and randomizes the order
     */
    private final void resetList() {
    }
    
    /**
     * * Moves to the next word in the list
     */
    private final void nextWord() {
    }
    
    /**
     * Methods for buttons presses 
     */
    public final void onSkip() {
    }
    
    public final void onCorrect() {
    }
    
    /**
     * Methods for completed events 
     */
    public final void onGameFinishComplete() {
    }
    
    public final void onBuzzComplete() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public GameViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0016\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/guesstheword/screens/game/GameViewModel$BuzzType;", "", "pattern", "", "(Ljava/lang/String;I[J)V", "getPattern", "()[J", "CORRECT", "GAME_OVER", "COUNTDOWN_PANIC", "NO_BUZZ", "app_debug"})
    public static enum BuzzType {
        /*public static final*/ CORRECT /* = new CORRECT(null) */,
        /*public static final*/ GAME_OVER /* = new GAME_OVER(null) */,
        /*public static final*/ COUNTDOWN_PANIC /* = new COUNTDOWN_PANIC(null) */,
        /*public static final*/ NO_BUZZ /* = new NO_BUZZ(null) */;
        @org.jetbrains.annotations.NotNull()
        private final long[] pattern = null;
        
        @org.jetbrains.annotations.NotNull()
        public final long[] getPattern() {
            return null;
        }
        
        BuzzType(long[] pattern) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/android/guesstheword/screens/game/GameViewModel$Companion;", "", "()V", "COUNTDOWN_PANIC_SECONDS", "", "COUNTDOWN_TIME", "DONE", "ONE_SECOND", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}