package JfreeChart;

import java.awt.*;

import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.labels.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.data.category.*;
import org.jfree.ui.*;

public class PolylineBarChart {
	// Run As > Java Application ���� �����ϸ� �ٷ� Ȯ���� �� ����.

	public static void main(final String[] args) {

		PolylineBarChart demo = new PolylineBarChart();

		JFreeChart chart = demo.getChart();

		ChartFrame frame1 = new ChartFrame("Bar Chart", chart);

		frame1.setSize(800, 400);

		frame1.setVisible(true);

	}

	public JFreeChart getChart() {

		// ������ ����

		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset(); // line chart 1

		// ������ �Է� ( ��, ����, ī�װ� )

		for(int i=1;i<=30;i++) {
			dataset2.addValue(i*300, "����", Integer.toString(i));
		}
//		dataset2.addValue(9000.0, "����", "1");
//
//		dataset2.addValue(80000, "����", "2");
//
//		dataset2.addValue(7660, "����", "3");
//
//		dataset2.addValue(60000, "����", "4");
//
//		dataset2.addValue(27000, "����", "5");
//
//		dataset2.addValue(9.0, "����", "6");
//
//		dataset2.addValue(5.0, "����", "7");
//
//		dataset2.addValue(4.0, "����", "8");
//
//		dataset2.addValue(8.0, "����", "9");
//
//		dataset2.addValue(8.0, "����", "10");
//
//		dataset2.addValue(8.0, "����", "11");
//
//		dataset2.addValue(8.0, "����", "12");
//
//		dataset2.addValue(7.0, "����", "13");
//
//		dataset2.addValue(7.0, "����", "14");
//
//		dataset2.addValue(7.0, "����", "14");
//
//		dataset2.addValue(7.0, "����", "14");
//
//		dataset2.addValue(7.0, "����", "14");
//
//		dataset2.addValue(7.0, "����", "14");
//
//		dataset2.addValue(7.0, "����", "14");
//
//		dataset2.addValue(7.0, "����", "14");
//
//		dataset2.addValue(7.0, "����", "14");
//
//		dataset2.addValue(7.0, "����", "14");
//
//		dataset2.addValue(7.0, "����", "14");


		// ������ ���� �� ����

		// ������ ����

		final BarRenderer renderer = new BarRenderer();

		final BarRenderer renderer12 = new BarRenderer();

		final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();

		// ���� �ɼ� ����

		final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();

		final ItemLabelPosition p_center = new ItemLabelPosition(

				ItemLabelAnchor.CENTER, TextAnchor.CENTER

		);

		final ItemLabelPosition p_below = new ItemLabelPosition(

				ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT

		);

		Font f = new Font("Gulim", Font.BOLD, 14);

		Font axisF = new Font("Gulim", Font.PLAIN, 14);

		// ������ ����

		// �׷��� 3

		renderer2.setBaseItemLabelGenerator(generator);

		renderer2.setBaseItemLabelsVisible(true);

		renderer2.setBaseShapesVisible(true);

		renderer2.setDrawOutlines(true);

		renderer2.setUseFillPaint(true);

		renderer2.setBaseFillPaint(Color.WHITE);

		renderer2.setBaseItemLabelFont(f);

		renderer2.setBasePositiveItemLabelPosition(p_below);

		renderer2.setSeriesPaint(0, new Color(219, 121, 22));

		renderer2.setSeriesStroke(0, new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 3.0f)

		);

		// plot ����

		final CategoryPlot plot = new CategoryPlot();

		// plot �� ������ ����

		plot.setRenderer(renderer);

		plot.setDataset(2, dataset2);

		plot.setRenderer(2, renderer2);

		// plot �⺻ ����

		plot.setOrientation(PlotOrientation.VERTICAL); // �׷��� ǥ�� ����

		plot.setRangeGridlinesVisible(true); // X�� ���̵� ���� ǥ�ÿ���

		plot.setDomainGridlinesVisible(true); // Y�� ���̵� ���� ǥ�ÿ���

		// ������ ���� ���� : dataset ��� ������� ������ ( ��, ���� ����Ѱ� �Ʒ��� �� )

		plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);

		// X�� ����

		plot.setDomainAxis(new CategoryAxis()); // X�� ���� ����

		plot.getDomainAxis().setTickLabelFont(axisF); // X�� ���ݶ� ��Ʈ ����

		plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.STANDARD); // ī�װ� �� ��ġ ����

		// Y�� ����

		plot.setRangeAxis(new NumberAxis()); // Y�� ���� ����

		plot.getRangeAxis().setTickLabelFont(axisF); // Y�� ���ݶ� ��Ʈ ����

		final JFreeChart chart = new JFreeChart(plot);

		return chart;

	}

}
