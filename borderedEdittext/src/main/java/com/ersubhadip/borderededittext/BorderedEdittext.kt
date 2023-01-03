import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText


public class BorderedEdittext : AppCompatEditText {

    private var paint: Paint? = null

    public constructor(context: Context) : super(context) {
        init(Color.BLACK, 2f)
    }

    public constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(Color.BLACK, 2f)
    }

    public constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(Color.BLACK, 2f)
    }

    public constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        color: Int,
        stokeWidth: Float
    ) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(color, stokeWidth)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val left = left + paddingLeft
        val top = top + paddingTop
        val right = right - paddingRight
        val bottom = bottom - paddingBottom
        canvas!!.drawRect(left.toFloat(), top.toFloat(), right.toFloat(), bottom.toFloat(), paint!!)

    }

    private fun init(color: Int, stokeWidth: Float) {
        paint = Paint()
        paint!!.color = color
        paint!!.style = Paint.Style.STROKE
        paint!!.strokeWidth = stokeWidth
    }

}