package open.dolphin.order;

import java.util.ListResourceBundle;

/**
 * MML Table Dictionary class.
 *
 * @author Kazushi Minagawa, Digital Globe, Inc.
 */
public final class ClaimResource extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            {"110", "初診料"},
            {"120", "再診料"},
            {"130", "管理料"},
            {"140", "在宅料"},
            {"141", "在宅薬剤"},
            {"142", "在宅材料"},
            {"143", "在宅加算料"},
            {"148", "在宅薬剤（院外処方）"},
            {"149", "在宅材料（院外処方）"},
            {"210", "内服薬剤"},
            {"211", "内服薬剤（院内処方）"},
            {"212", "内服薬剤（院外処方）"},
            {"213", "内服薬剤（処方のみ）"},
            {"214", "内服薬剤（入院調剤料なし）"},
            {"220", "頓服薬剤"},
            {"221", "頓服薬剤（院内処方）"},
            {"222", "頓服薬剤（院外処方）"},
            {"223", "頓服薬剤（処方のみ）"},
            {"224", "頓服薬剤（入院調剤料なし）"},
            {"230", "外用薬剤"},
            {"231", "外用薬剤（院内処方）"},
            {"232", "外用薬剤（院外処方）"},
            {"233", "外用薬剤（処方のみ）"},
            {"234", "外用薬剤（入院調剤料なし）"},
            {"240", "入院調剤料"},
            {"241", "内服調剤料"},
            {"242", "外用調剤料"},
            {"250", "処方料"},
            {"260", "麻毒加算"},
            {"270", "調剤技術基本料"},
            {"290", "内服薬剤（臨時投薬）"},
            {"291", "内服薬剤（臨時投薬）（院内）"},
            {"292", "内服薬剤（臨時投薬）（院外）"},
            {"293", "外用薬剤（臨時投薬）"},
            {"294", "外用薬剤（臨時投薬）（院内）"},
            {"295", "外用薬剤（臨時投薬）（院外）"},
            {"296", "頓服薬剤（臨時投薬）"},
            {"297", "頓服薬剤（臨時投薬）（院内）"},
            {"298", "頓服薬剤（臨時投薬）（院外）"},
            {"310", "皮下筋肉注射"},
            {"311", "皮下筋肉注射（手技料なし）"},
            {"312", "皮下筋肉注射（手技料変換なし）"},
            {"320", "静脈注射"},
            {"321", "静脈注射（手技料なし）"},
            {"330", "点滴注射"},
            {"331", "点滴注射（手技料なし）"},
            {"332", "点滴注射（手術以外）"},
            {"334", "在宅訪問点滴（薬剤料）"},
            {"340", "その他注射"},
            {"350", "中心静脈注射薬剤"},
            {"352", "中心静脈注射薬剤（手術以外）"},
            {"400", "処置行為"},
            {"401", "処置薬剤"},
            {"402", "処置材料"},
            {"403", "処置加算料"},
            {"409", "処置行為（労災読み替え加算対象外）"},
            {"500", "手術"},
            {"501", "手術薬剤"},
            {"502", "手術材料"},
            {"510", "輸血"},
            {"520", "ギブス"},
            {"540", "麻酔"},
            {"541", "麻酔薬剤"},
            {"542", "麻酔材料"},
            {"600", "検査"},
            {"601", "検査薬剤"},
            {"602", "検査材料"},
            {"603", "検査加算料"},
            {"610", "検査（包括対象外）"},
            {"640", "病理診断"},
            {"643", "病理診断加算料"},
            {"700", "画像診断"},
            {"701", "画像診断薬剤"},
            {"702", "画像診断材料"},
            {"703", "Ｘ線フィルム"},
            {"704", "画像診断加算料"},
            {"710", "診断料"},
            {"711", "Ｘ線診断料"},
            {"712", "核医学診断料"},
            {"713", "コンピューター診断料"},
            {"720", "撮影料"},
            {"721", "画像診断撮影料"},
            {"723", "コンピューター撮影料（ＣＴ）"},
            {"724", "コンピューター撮影料（ＭＲＩ）"},
            {"731", "造影剤・注入手技（点滴）"},
            {"732", "造影剤・注入手技（その他）"},
            {"800", "その他（リハビリ）"},
            {"809", "その他（労災・自賠責入力）"},
            {"810", "リハビリ（発生日等）"},
            {"820", "処方箋料"},
            {"830", "精神科専門療法"},
            {"840", "放射線治療"},
            {"850", "療養担当手当"},
            {"890", "入院料（外来）"},
            {"900", "入院（入院料）"},
            {"920", "入院（特定入院料・その他）"},
            {"930", "老人一部負担金"},
            {"950", "保険外（消費税なし）"},
            {"960", "保険外（消費税あり）"},
            {"961", "保険外（消費税あり）数量込金額"},
            {"970", "食事（食事療養）"},
            {"971", "食事（標準負担額）"},
            {"980", "コメント（処方せん備考）"},
            {"982", "コメント（退院時処方せん備考）"},
            {"990", "コメント"},
            {"991", "コメント（摘要欄下部表示）"},
            // RP
            {"PRESCRIPTION_NAME", new String[]{"内用（院内処方)","内用（院外処方）","頓用（院内処方）","頓用（院外処方）","外用（院内処方）","外用（院外処方）","臨時（院内処方）","臨時（院外処方）"}},
            {"PRESCRIPTION_CODE", new String[]{"211","212","221","222","231","232","291","292"}},
            {"PRESCRIPTION_EXTERNAL", "院外処方"},
            {"PRESCRIPTION_HOSPITAL", "院内処方"},
            {"IN_MEDICINE","院内処方"},
            {"EXT_MEDICINE","院外処方"},
            {"ADMIN_CODE_REGEXP", new String[]{"","0010001","0010002","0010003","0010004","(0010005|0010007)","0010006","0010008","0010009","001"}},
            {"INJECTION_CLASS_CODE", new String[]{"31","32","33"}},
            // Insurance
            {"INSURANCE_SELF", "自費"},
            {"INSURANCE_SELF_CODE", "Z1"},
            {"INSURANCE_SELF_PREFIX", "Z"},
            {"INSURANCE_ROSAI_PREFIX", "R1"},
            {"INSURANCE_JIBAISEKI_PREFIX", "R3"},
            {"INSURANCE_SYS", "MML031"},
            // アクセス権
            {"PERMISSION_ALL", "all"},
            {"PERMISSION_READ", "read"},
            {"ACCES_RIGHT_PATIENT", "patient"},
            {"ACCES_RIGHT_CREATOR", "creator"},
            {"ACCES_RIGHT_EXPERIENCE", "experience"},
            {"ACCES_RIGHT_PATIENT_DISP", "被記載者(患者)"},
            {"ACCES_RIGHT_CREATOR_DISP", "記載者施設"},
            {"ACCES_RIGHT_EXPERIENCE_DISP", "診療歴のある施設"},
            {"ACCES_RIGHT_PERSON_CODE", "personCode"},
            {"ACCES_RIGHT_FACILITY_CODE", "facilityCode"},
            {"ACCES_RIGHT_EXPERIENCE_CODE", "facilityCode"},
            // 病名
            {"DEFAULT_DIAGNOSIS_TITLE", "病名登録"},
            {"DEFAULT_DIAGNOSIS_CATEGORY", "mainDiagnosis"},
            {"DEFAULT_DIAGNOSIS_CATEGORY_DESC", "主病名"},
            {"DEFAULT_DIAGNOSIS_CATEGORY_CODESYS", "MML0012"},
            {"ORCA_OUTCOME_RECOVERED", "治癒"},
            {"ORCA_OUTCOME_DIED", "死亡"},
            {"ORCA_OUTCOME_END", "中止"},
            {"ORCA_OUTCOME_TRANSFERED", "移行"},
            // 
            {"MARITAL_STATUS", "maritalStatus"},
            {"NATIONALITY", "nationality"},
            {"MEMO", "memo"},
            {"MALE", "male"},
            {"MALE_DISP", "男"},
            {"FEMALE", "female"},
            {"FEMALE_DISP", "女"},
            {"UNKNOWN", "不明"},
            {"AGE", "歳"},
            //
            {"DEFAULT_NUMBER", "0"},
            {"DEFAULT_STAMP_NAME", "新規スタンプ"},
            {"FROM_EDITOR_STAMP_NAME", "エディタから"},
            // Master 
            {"MED_COST_FLGAS", new String[]{"廃", "金", "都", "", "", "", "", "減", "不"}},
            {"TOOL_COST_FLGAS", new String[]{"廃", "金", "都", "", "", "%加", "", "", "", "乗"}},
            {"TREAT_COST_FLGAS", new String[]{"廃", "金", "", "+点", "都", "%加", "%減", "減", "-点"}},
            {"IN_OUT_FLAGS", new String[]{"入外", "入", "外"}},
            {"HOSPITAL_CLINIC_FLAGS", new String[]{"病診", "病", "診"}},
            {"OLD_FLAGS", new String[]{"社老", "社", "老"}},
            // 用法
            {"ADMIN_MARK", "[用法] "},
            {"REG_ADMIN_MARK", "\\\\[用法\\\\] "},
            // 組み合わせができるマスター項目
            {"REG_BASE_CHARGE", "[手そ]"},
            {"REG_INSTRACTION_CHARGE", "[手そ薬材]"}, // 在宅で薬剤、材料を追加
            {"REG_MED_ORDER", "[薬用材そ]"},          // 保険適用外の医薬品等追加
            {"REG_INJECTION_ORDER", "[手そ注材]"},
            {"REG_TREATMENT", "[手そ薬材]"},
            {"REG_SURGERY_ORDER", "[手そ薬材]"},
            {"REG_BACTERIA_ORDER", "[手そ薬材]"},
            {"REG_PHYSIOLOGY_ORDER", "[手そ薬材]"},
            {"REG_LABO_TEST", "[手そ薬材]"},
            {"REG_RADIOLOGY_ORDER", "[手そ薬材部]"},
            {"REG_OTHER_ORDER", "[手そ薬材]"},
            {"REG_GENERAL_ORDER", "[手そ薬材用部]"},
            // セットできる診療行為区分
            {"SHIN_BASE_CHARGE", "^(11|12)"},
            {"SHIN_INSTRACTION_CHARGE", "^(13|14)"},
            {"SHIN_MED_ORDER", ""},                // 210|220|230
            {"SHIN_INJECTION_ORDER", "^3"},        // 310|320|330
            {"SHIN_TREATMENT", "^4"},
            {"SHIN_SURGERY_ORDER", "^5"},
            {"SHIN_BACTERIA_ORDER", "^6"},
            {"SHIN_PHYSIOLOGY_ORDER", "^6"},
            {"SHIN_LABO_TEST", "^6"},
            {"SHIN_RADIOLOGY_ORDER", "^7"},
            {"SHIN_OTHER_ORDER", "^8"},
//s.oh^ 汎用スタンプエディタ修正
            //{"SHIN_GENERAL_ORDER", "\\\\d"},
            {"SHIN_GENERAL_ORDER", "\\d{3}"},
//s.oh$
            // エディタに表示する名前
            {"NAME_BASE_CHARGE", "Base Fee"},
            {"NAME_INSTRACTION_CHARGE", "Instraction"}, // 指導・在宅
            {"NAME_MED_ORDER", "Medication"},
            {"NAME_INJECTION_ORDER", "Injection"},
            {"NAME_TREATMENT", "Treatment"},
            {"NAME_SURGERY_ORDER", "Surgery"},
            {"NAME_BACTERIA_ORDER", "Bacteria Eaxmination"},
            {"NAME_PHYSIOLOGY_ORDER", "Physiological and Endoscopic Examination"},
            {"NAME_LABO_TEST", "Laboratory Test"},
            {"NAME_RADIOLOGY_ORDER", "Image Eaxmination"},
            {"NAME_OTHER_ORDER", "Other"},
            {"NAME_GENERAL_ORDER", "General"},
            // 暗黙の診療行為区分
            {"IMPLIED_BASE_CHARGE", ""},
            {"IMPLIED_INSTRACTION_CHARGE", ""},
            {"IMPLIED_MED_ORDER", ""},
            {"IMPLIED_INJECTION_ORDER", ""},
            {"IMPLIED_TREATMENT", "400"},
            {"IMPLIED_SURGERY_ORDER", ""},
            {"IMPLIED_BACTERIA_ORDER", "600"},
            {"IMPLIED_PHYSIOLOGY_ORDER", "600"},
            {"IMPLIED_LABO_TEST", "600"},
            {"IMPLIED_RADIOLOGY_ORDER", "700"},
            {"IMPLIED_OTHER_ORDER", "800"},
            {"IMPLIED_GENERAL_ORDER", ""},
            // 情報
            {"INFO_BASE_CHARGE", "Base Fee (Class=110-120)"},
            {"INFO_INSTRACTION_CHARGE", "Instruction (Class=130-140)"},
            {"INFO_MED_ORDER", "Medication"},
            {"INFO_INJECTION_ORDER", "Injection (Class=300)"},
            {"INFO_TREATMENT", "Treatment (Class=400)"},
            {"INFO_SURGERY_ORDER", "Surgery (Class=500)"},
            {"INFO_BACTERIA_ORDER", "Bacteria Examination (Class=600)"},
            {"INFO_PHYSIOLOGY_ORDER", "Physiological and Endoscopy (Class=600)"},
            {"INFO_LABO_TEST", "Lab Test (Class=600)"},
            {"INFO_RADIOLOGY_ORDER", "Image (Class=700)"},
            {"INFO_OTHER_ORDER", "Other (Class=800)"},
            {"INFO_GENERAL_ORDER", "General (Class=100-999)"},
            // 病名
            {"NAME_DIAGNOSIS", "傷病名"},
            {"REG_DIAGNOSIS", "[手そ薬材用部]"},
            // 辞書のキー
            {"KEY_ORDER_NAME", "orderName"},
            {"KEY_PASS_REGEXP", "passRegExp"},
            {"KEY_SHIN_REGEXP", "shinkuRegExp"},
            {"KEY_INFO", "info"},
            {"KEY_IMPLIED", "implied007"},
            // 編集不可コメント
            {"COMMENT_82", new String[]{"82","0082","８２","００８２"}},
            // 編集可能コメント
            {"NUMBER_EDITABLE_COMMENT", new String[]{"84","0084"}},
            {"NAME_EDITABLE_COMMENT", new String[]{"81","0081","83","0083","85","0085","86","0086"}},
            // 検索特殊記号文字
            {"ASTERISK_HALF", "*"},
            {"ASTERISK_FULL", "＊"},
            {"TENSU_SEARCH_HALF", "///"},
            {"TENSU_SEARCH_FULL", "／／／"},
            {"COMMENT_SEARCH_HALF", "8"},
            {"COMMENT_SEARCH_FULL", "８"},
            // Slot
            {"SLOT_SYUGI","手技"},
            {"SLOT_NAIYO_YAKU","内用薬"},
            {"SLOT_TYUSHYA_YAKU","注射薬"},
            {"SLOT_GAIYO_YAKU","外用薬"},
            {"SLOT_YAKUZAI","薬剤"},
            {"SLOT_MEDICINE","薬"},
            {"SLOT_ZAIRYO","材料"},
            {"SLOT_YOHO","用法"},
            {"SLOT_BUI","部位"},
            {"SLOT_OTHER","その他"},
            // Unit
            {"UNIT_T","錠"},
            {"UNIT_G","ｇ"},
            {"UNIT_ML","ｍＬ"},
            {"UNIT_CAPSULE","カプセル"}
        };
    }
}
