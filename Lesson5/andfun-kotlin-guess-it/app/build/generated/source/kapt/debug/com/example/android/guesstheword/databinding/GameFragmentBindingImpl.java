package com.example.android.guesstheword.databinding;
import com.example.android.guesstheword.R;
import com.example.android.guesstheword.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GameFragmentBindingImpl extends GameFragmentBinding implements com.example.android.guesstheword.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.word_is_text, 6);
        sViewsWithIds.put(R.id.guideline, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GameFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private GameFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            );
        this.correctButton.setTag(null);
        this.gameLayout.setTag(null);
        this.scoreText.setTag(null);
        this.skipButton.setTag(null);
        this.timerText.setTag(null);
        this.wordText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.android.guesstheword.generated.callback.OnClickListener(this, 1);
        mCallback3 = new com.example.android.guesstheword.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.gameViewModel == variableId) {
            setGameViewModel((com.example.android.guesstheword.screens.game.GameViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameViewModel(@Nullable com.example.android.guesstheword.screens.game.GameViewModel GameViewModel) {
        this.mGameViewModel = GameViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.gameViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGameViewModelCurrentTimeString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeGameViewModelScore((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeGameViewModelWord((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGameViewModelCurrentTimeString(androidx.lifecycle.LiveData<java.lang.String> GameViewModelCurrentTimeString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelScore(androidx.lifecycle.LiveData<java.lang.Integer> GameViewModelScore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViewModelWord(androidx.lifecycle.LiveData<java.lang.String> GameViewModelWord, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String gameViewModelCurrentTimeStringGetValue = null;
        java.lang.String wordTextAndroidStringQuoteFormatGameViewModelWord = null;
        java.lang.String scoreTextAndroidStringScoreFormatGameViewModelScore = null;
        com.example.android.guesstheword.screens.game.GameViewModel gameViewModel = mGameViewModel;
        java.lang.String gameViewModelWordGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> gameViewModelCurrentTimeString = null;
        androidx.lifecycle.LiveData<java.lang.Integer> gameViewModelScore = null;
        java.lang.Integer gameViewModelScoreGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> gameViewModelWord = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (gameViewModel != null) {
                        // read gameViewModel.currentTimeString
                        gameViewModelCurrentTimeString = gameViewModel.getCurrentTimeString();
                    }
                    updateLiveDataRegistration(0, gameViewModelCurrentTimeString);


                    if (gameViewModelCurrentTimeString != null) {
                        // read gameViewModel.currentTimeString.getValue()
                        gameViewModelCurrentTimeStringGetValue = gameViewModelCurrentTimeString.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (gameViewModel != null) {
                        // read gameViewModel.score
                        gameViewModelScore = gameViewModel.getScore();
                    }
                    updateLiveDataRegistration(1, gameViewModelScore);


                    if (gameViewModelScore != null) {
                        // read gameViewModel.score.getValue()
                        gameViewModelScoreGetValue = gameViewModelScore.getValue();
                    }


                    // read @android:string/score_format
                    scoreTextAndroidStringScoreFormatGameViewModelScore = scoreText.getResources().getString(R.string.score_format, gameViewModelScoreGetValue);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (gameViewModel != null) {
                        // read gameViewModel.word
                        gameViewModelWord = gameViewModel.getWord();
                    }
                    updateLiveDataRegistration(2, gameViewModelWord);


                    if (gameViewModelWord != null) {
                        // read gameViewModel.word.getValue()
                        gameViewModelWordGetValue = gameViewModelWord.getValue();
                    }


                    // read @android:string/quote_format
                    wordTextAndroidStringQuoteFormatGameViewModelWord = wordText.getResources().getString(R.string.quote_format, gameViewModelWordGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.correctButton.setOnClickListener(mCallback3);
            this.skipButton.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.scoreText, scoreTextAndroidStringScoreFormatGameViewModelScore);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timerText, gameViewModelCurrentTimeStringGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wordText, wordTextAndroidStringQuoteFormatGameViewModelWord);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // gameViewModel
                com.example.android.guesstheword.screens.game.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {


                    gameViewModel.onSkip();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // gameViewModel
                com.example.android.guesstheword.screens.game.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {


                    gameViewModel.onCorrect();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameViewModel.currentTimeString
        flag 1 (0x2L): gameViewModel.score
        flag 2 (0x3L): gameViewModel.word
        flag 3 (0x4L): gameViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}