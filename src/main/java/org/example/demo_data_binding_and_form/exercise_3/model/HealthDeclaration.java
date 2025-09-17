package org.example.demo_data_binding_and_form.exercise_3.model;

public class HealthDeclaration {
    private int id;
    private String fullName;
    private Integer birthYear;
    private String gender;
    private String nationality;
    private String identityNumber;

    // Phương tiện di chuyển
    private String vehicleType;
    private String vehicleNumber;
    private String seatNumber;
    private String startDate;
    private String endDate;

    // Lịch sử di chuyển
    private String travelHistory;

    // Địa chỉ liên lạc
    private String province;
    private String district;
    private String ward;
    private String detailedAddress;

    private String phone;
    private String email;

    // Triệu chứng
    private boolean fever;
    private boolean cough;
    private boolean shortnessOfBreath;
    private boolean soreThroat;
    private boolean nausea;
    private boolean diarrhea;
    private boolean hemorrhage;
    private boolean rash;

    // Lịch sử phơi nhiễm
    private boolean contactWithAnimal;
    private boolean closeContactWithInfected;

    public HealthDeclaration() {}

    // Constructor đầy đủ
    public HealthDeclaration(int id, String fullName, Integer birthYear, String gender, String nationality,
                             String identityNumber, String vehicleType, String vehicleNumber, String seatNumber,
                             String startDate, String endDate, String travelHistory,
                             String province, String district, String ward, String detailedAddress,
                             String phone, String email,
                             boolean fever, boolean cough, boolean shortnessOfBreath, boolean soreThroat,
                             boolean nausea, boolean diarrhea, boolean hemorrhage, boolean rash,
                             boolean contactWithAnimal, boolean closeContactWithInfected) {
        this.id = id;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.nationality = nationality;
        this.identityNumber = identityNumber;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.seatNumber = seatNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.travelHistory = travelHistory;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.detailedAddress = detailedAddress;
        this.phone = phone;
        this.email = email;
        this.fever = fever;
        this.cough = cough;
        this.shortnessOfBreath = shortnessOfBreath;
        this.soreThroat = soreThroat;
        this.nausea = nausea;
        this.diarrhea = diarrhea;
        this.hemorrhage = hemorrhage;
        this.rash = rash;
        this.contactWithAnimal = contactWithAnimal;
        this.closeContactWithInfected = closeContactWithInfected;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public Integer getBirthYear() { return birthYear; }
    public void setBirthYear(Integer birthYear) { this.birthYear = birthYear; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public String getIdentityNumber() { return identityNumber; }
    public void setIdentityNumber(String identityNumber) { this.identityNumber = identityNumber; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public String getTravelHistory() { return travelHistory; }
    public void setTravelHistory(String travelHistory) { this.travelHistory = travelHistory; }

    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }

    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }

    public String getWard() { return ward; }
    public void setWard(String ward) { this.ward = ward; }

    public String getDetailedAddress() { return detailedAddress; }
    public void setDetailedAddress(String detailedAddress) { this.detailedAddress = detailedAddress; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isFever() { return fever; }
    public void setFever(boolean fever) { this.fever = fever; }

    public boolean isCough() { return cough; }
    public void setCough(boolean cough) { this.cough = cough; }

    public boolean isShortnessOfBreath() { return shortnessOfBreath; }
    public void setShortnessOfBreath(boolean shortnessOfBreath) { this.shortnessOfBreath = shortnessOfBreath; }

    public boolean isSoreThroat() { return soreThroat; }
    public void setSoreThroat(boolean soreThroat) { this.soreThroat = soreThroat; }

    public boolean isNausea() { return nausea; }
    public void setNausea(boolean nausea) { this.nausea = nausea; }

    public boolean isDiarrhea() { return diarrhea; }
    public void setDiarrhea(boolean diarrhea) { this.diarrhea = diarrhea; }

    public boolean isHemorrhage() { return hemorrhage; }
    public void setHemorrhage(boolean hemorrhage) { this.hemorrhage = hemorrhage; }

    public boolean isRash() { return rash; }
    public void setRash(boolean rash) { this.rash = rash; }

    public boolean isContactWithAnimal() { return contactWithAnimal; }
    public void setContactWithAnimal(boolean contactWithAnimal) { this.contactWithAnimal = contactWithAnimal; }

    public boolean isCloseContactWithInfected() { return closeContactWithInfected; }
    public void setCloseContactWithInfected(boolean closeContactWithInfected) { this.closeContactWithInfected = closeContactWithInfected; }
}
