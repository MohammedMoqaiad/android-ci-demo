# android-ci-demo
homework  android-ci-

# Commerce App CI

## الهدف
إنشاء CI Pipeline شامل لتطبيق Android Shopping App باستخدام GitHub Actions.  
الهدف هي عمليه ضمان جودة الكود وتشغيل الاختبارات بشكل تلقائي مع كل تعديل على المشروع.

---

## خطوات الـ CI
يتم تشغيل الـ Pipeline عند أي **push** أو **pull request** على الفروع:
- `main`
- `develop`
- `feature/**`

### الـ Jobs:
1. **Code Quality**
   - تشغيل Lint للتأكد من جودة الكود.
   - تشغيل Detekt لتحليل الكود.
   - رفع تقارير الجودة كـ Artifact.

2. **Unit Tests**
   - تشغيل اختبارات الوحدة (Unit Tests).
   - توليد تقرير تغطية الكود (Jacoco).
   - رفع نتائج الاختبارات والتغطية.

3. **Instrumented Tests**
   - تشغيل اختبارات Android على Emulator بمستويات API مختلفة (28, 30, 33).
   - رفع نتائج الاختبارات كـ Artifact.

4. **Build Debug APK**
   - بناء نسخة Debug من التطبيق.
   - رفع ملف APK كـ Artifact يمكن تحميله.

---

## المخرجات
- تقارير الجودة (Lint + Detekt) متوفرة في تبويب **Actions**.
- نتائج الاختبارات (Unit + Instrumented) متوفرة كـ Artifact.
- ملف APK جاهز للتحميل من تبويب **Actions**.

---

## كيفية التشغيل محليًا
- تشغيل Lint:
  ```bash
  ./gradlew lintDebug



    
ملاحظه ////   jdk 17  غير متوافق مع الجهاز لانه jdk 25  فقمت باستخدان GitHub Actions 
