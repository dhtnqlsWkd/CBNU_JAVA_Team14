package JfreeChart;

import java.awt.*;
import Database.*;

import java.util.Calendar;

import javax.swing.*;

import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.labels.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.data.category.*;
import org.jfree.data.general.*;
import org.jfree.ui.*;

public class JChart {
	// Run As > Java Application ���� �����ϸ� �ٷ� Ȯ���� �� ����.

	public void showPieChart(int year, int month) {

		JChart demo = new JChart();
		
		JFreeChart chart = demo.getPieChart(year, month);

		ChartFrame frame1 = new ChartFrame("���� �м�", chart);
		
		frame1.setSize(800, 400);
		frame1.setLocation(1800,200);
		frame1.setVisible(true);

	}
	
	public void showLineChart(int year,int month) {
		
		JChart demo = new JChart();
		
		JFreeChart chart = demo.getLineChart(year, month);

		ChartFrame frame1 = new ChartFrame("���� �׷���", chart);
		
		frame1.setSize(800, 400);
		frame1.setLocation(1800,200);

		frame1.setVisible(true);		
	}
	

	public JFreeChart getPieChart(int year, int month) {
		JDBCExam a = new JDBCExam();
		DefaultPieDataset dataset1 = new DefaultPieDataset(); // Pie chart

		// dataset1.addValue(a.productSum_kinds(2017, 12, 1, 1),"����");
		String s1 = "�ĺ�";
		String s2 = "�����";
		String s3 = "ī��";
		String s4 = "����ǰ";
		String s5 = "��ȭ��Ȱ";
		String s6 = "������";

		dataset1.setValue(s1, a.productSum_kinds(year, month, 1, 0));
		dataset1.setValue(s2, a.productSum_kinds(year, month, 1, 1));
		dataset1.setValue(s3, a.productSum_kinds(year, month, 1, 2));
		dataset1.setValue(s4, a.productSum_kinds(year, month, 1, 3));
		dataset1.setValue(s5, a.productSum_kinds(year, month, 1, 4));
		dataset1.setValue(s6, a.productSum_kinds(year, month, 1, 5));
		JFreeChart chart = ChartFactory.createPieChart("", dataset1, true, true, false);

		chart.getTitle().setFont(new Font("����", Font.BOLD, 14));
		chart.getLegend().setItemFont(new Font("����", Font.PLAIN, 10));

		PiePlot plot = (PiePlot) chart.getPlot();
		plot.setLabelFont(new Font("����", Font.PLAIN, 12));
		return chart;
	}

	public JFreeChart getLineChart(int year, int month) {
		JDBCExam a = new JDBCExam();

		// ������ ����

		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset(); // line chart

		// ������ �Է� ( ��, ����, ī�װ� )
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		
		for (int i = 1; i <= cal.getMaximum(Calendar.DAY_OF_MONTH); i++) {
			dataset2.addValue(a.productSum_day(year, month, i, 1), "����", Integer.toString(i));
		}

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
