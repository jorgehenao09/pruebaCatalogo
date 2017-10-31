package com.jhdev.pruebacatalogo.adapters;

import android.content.Context;
import android.support.v4.util.Pair;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jhdev.pruebacatalogo.R;
import com.jhdev.pruebacatalogo.activities.main.interfaces.MainView;
import com.jhdev.pruebacatalogo.dto.Data;
import com.jhdev.pruebacatalogo.util.TransitionHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Jorge Henao on 30/10/2017.
 */

public class RecyclerItemsAdapter extends RecyclerView.Adapter<RecyclerItemsAdapter.ItemViewHolder>{

    private List<Data> mDataList;
    private Context mContext;
    private ItemViewHolder viewSeleccionado;
    private MainView mView;
    private int heightView;
    private Long timeAnim = 700L;

    public RecyclerItemsAdapter(List<Data> dataList, Context context, MainView view) {
        mDataList = dataList;
        mContext = context;
        mView = view;
    }

    /**
     * Este metodo asocia el layout item_recycler.xml con el recyclerView (infla el layout)
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);

        return new ItemViewHolder(view);
    }

    /**
     * Este metodo modifica los elementos de la clase ItemViewHolder con respecto a cada objeto de la lista items
     *
     * @param itemViewHolder
     * @param position
     */
    @Override
    public void onBindViewHolder(final ItemViewHolder itemViewHolder, int position) {

        final Data data = mDataList.get(position);

        //Se descarga la imagen del item
        Glide.with(mContext)
                .load(data.getIcon_img())
                .into(itemViewHolder.mImage);

        //Se hace la correlacion de datos con los campos de la tarjeta
        itemViewHolder.mTitle.setText(data.getTitle());
        itemViewHolder.mAudience.setText(data.getAudience_target());

        //Acciones realizadas al momento de dar clic sobre la tarjeta
        itemViewHolder.mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                * Se verifica que la tarjeta seleccionada no sea igual a la ultima seleccionada
                * Evitando que se realicen acciones innecesarias
                */
                if (!itemViewHolder.equals(viewSeleccionado)){

                    //Se hace la correlacion de datos con los campos de detalles
                    itemViewHolder.mSubtitle.setText(data.getSubmit_text_label());
                    itemViewHolder.mSuscribers.setText(String.valueOf(data.getSubscribers()));
                    itemViewHolder.mLanguage.setText(data.getLang());

                    //Se muestra la animacion de despliegue
                    showView(itemViewHolder.mContainer, itemViewHolder.mContainer);

                    itemViewHolder.mArrow.setRotation(180);

                    //Se muestran los detalles
                    itemViewHolder.mContainer.setVisibility(View.VISIBLE);

                    viewSeleccionado = itemViewHolder;
                } else {
                    if (itemViewHolder.mContainer.getVisibility() == View.GONE) {

                        //Se muestra la animacion de despliegue
                        showView(itemViewHolder.mContainer, itemViewHolder.mContainer);

                        itemViewHolder.mArrow.setRotation(180);
                    } else {
                        //Se muestra la animacion
                        hideView(itemViewHolder.mContainer, itemViewHolder.mContainer);

                        itemViewHolder.mArrow.setRotation(0);
                    }

                    viewSeleccionado = itemViewHolder;
                }
            }
        });

        //Acciones realizadas al momento de dar clic en el boton ver mas
        itemViewHolder.mMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView.launchIntentDetails(data, itemViewHolder.mImage);
            }
        });
    }

    /**
     * Cantidad de elementos que contiene la lista de direcciones
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private View mItemView;

        @BindView(R.id.item_image) ImageView mImage;
        @BindView(R.id.item_arrow) ImageView mArrow;

        @BindView(R.id.item_container_details) LinearLayout mContainer;

        @BindView(R.id.item_cardview) CardView mCardview;

        @BindView(R.id.item_title) TextView mTitle;
        @BindView(R.id.item_submit_text_label) TextView mSubtitle;
        @BindView(R.id.item_audience) TextView mAudience;
        @BindView(R.id.item_number_suscribers) TextView mSuscribers;
        @BindView(R.id.item_language) TextView mLanguage;

        @BindView(R.id.item_more) Button mMore;

        public ItemViewHolder(View itemView) {
            super(itemView);
            mItemView = itemView;
            ButterKnife.bind(this, itemView);
        }
    }

    public void showView(View view, final ViewGroup viewGroup) {
        view.setVisibility(View.VISIBLE);
        if(view.getHeight() != 0 ){
            heightView = view.getHeight();
        }

        final Animation animation = new TranslateAnimation(0, 0, heightView, 0);
        animation.setDuration(timeAnim);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                viewGroup.clearAnimation();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        viewGroup.startAnimation(animation);
    }

    public void hideView(final View view, final ViewGroup viewGroup){
        if(view.getHeight() != 0 ){
            heightView= view.getHeight();
        }
        Animation animation = new TranslateAnimation(0, 0, 0, heightView);
        animation.setDuration(timeAnim);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(View.GONE);
                viewGroup.clearAnimation();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        viewGroup.startAnimation(animation);
    }
}
